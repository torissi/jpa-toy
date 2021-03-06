package me.torissi.orderingrediants.domain.dto.request;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderInfoCreateRequest {

  @Positive
  private Integer quantity;

  @NotNull
  @Valid
  private IdRequest ingredient;

}
