package com.test.cryptopunk.task.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class CyrptoPunkInfo {
    private  int punkIndex;
    private String gender;
    private List<String> accessories;
}
