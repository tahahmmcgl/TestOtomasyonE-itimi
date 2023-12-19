package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Department {
    private String Name;
    private String Location;
    private String Manager;
    private Employee[] employees;
}
