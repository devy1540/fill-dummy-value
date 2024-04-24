package com.devy.dummy.instance;

import com.google.common.base.MoreObjects;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
public class TestInstance {

    private int var1;
    private Integer var2;
    private long var3;
    private Long var4;
    private float var5;
    private Float var6;
    private double var7;
    private Double var8;
    private String var9;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("var1", var1)
                .add("var2", var2)
                .add("var3", var3)
                .add("var4", var4)
                .add("var5", var5)
                .add("var6", var6)
                .add("var7", var7)
                .add("var8", var8)
                .add("var9", var9)
                .toString();
    }
}
