package com.interview.api.dto.request.link;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LinkRequestDto {
    @ApiModelProperty(example = "https://gmlwjd9405.github.io/2018/09/14/process-vs-thread.html")
    private String url;

    private Long problemId;

}
