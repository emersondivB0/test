package com.alura.foro.modelo.curso;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarCurso(@NotNull Long id, @NotBlank String nombre,@NotBlank String categoria) {
}
