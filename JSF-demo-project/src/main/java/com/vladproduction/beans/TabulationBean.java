package com.vladproduction.beans;

import com.vladproduction.data.Point;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.stream.IntStream;

@Named
@SessionScoped
@Data
public class TabulationBean implements Serializable {
    private List<Point> points;

    private double start;
    private double end;
    private double step;

    public String tabulate() {
        int n = (int) Math.round((end - start) / step) + 1;
        points = IntStream.range(0, n)
                .mapToDouble(i -> start + i * step)
                .mapToObj(x -> new Point(x, Math.sin(x)))
                .toList();
        return "tab";
    }


}
