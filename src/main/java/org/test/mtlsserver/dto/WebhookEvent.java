package org.test.mtlsserver.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WebhookEvent {
    private String evento;
    private String dataHora;
    private WebhookDadosEvent dados;
}
