package com.interview.api.dto.request.pack;

import com.interview.api.dto.request.problem.ProblemDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PackRequestDto {
    List<ProblemDto> problems;
}
