package SpringAvancado.com.Desafio6.auth;

import SpringAvancado.com.Desafio6.config.JwtService;
import SpringAvancado.com.Desafio6.repository.UserRepository;
import SpringAvancado.com.Desafio6.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticatonService {
    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;


    public AuthenticationResponse register(User usuario) {
        var user = User.builder()

                .cpf(usuario.getCpf())
                .password(passwordEncoder.encode(usuario.getPassword()))

                .build();

        repository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(User usuario) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        usuario.getCpf(),
                        usuario.getPassword()
                )
        );
        var user = repository.findByCpf(usuario.getCpf())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}


