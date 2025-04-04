package com.desafio.itau.dto;

import java.math.BigDecimal;

public class EstatisticaDTO {
    Long count;
    BigDecimal sum;
    BigDecimal avg;
    BigDecimal min;
    BigDecimal max;

    public EstatisticaDTO() {
        this.count = 0L;
        this.sum = BigDecimal.ZERO;
        this.avg = BigDecimal.ZERO;
        this.min = BigDecimal.ZERO;
        this.max = BigDecimal.ZERO;
    }

    public BigDecimal getAvg() {
        return avg;
    }

    public void setAvg(BigDecimal avg) {
        this.avg = avg;
    }

    public BigDecimal getMax() {
        return max;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public BigDecimal getMin() {
        return min;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    public Long getCount() {
        return count;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }
}
