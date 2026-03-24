package co.edu.eci.lambda.springrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LucasController {

    @GetMapping("/lucasseq")
    public LucasResponse lucas(@RequestParam("value") int value) {

        if (value < 0) {
            value = 0;
        }

        String sequence = buildLucasSequence(value);
        return new LucasResponse("Secuencia de Lucas", value, sequence);
    }

    private String buildLucasSequence(int n) {
        StringBuilder builder = new StringBuilder();

        if (n == 0) {
            builder.append("2");
            return builder.toString();
        }

        int a = 2;
        int b = 1;

        builder.append(a);
        builder.append(", ");
        builder.append(b);

        for (int i = 2; i <= n; i++) {
            int next = a + b;
            builder.append(", ");
            builder.append(next);
            a = b;
            b = next;
        }

        return builder.toString();
    }
}