package com.example.wuzhongwenweb.common;

import java.util.Objects;

public class Result {

    Object data;
    Error error;

    public Result() {
    }

    public Result(Object data, Error error) {
        this.data = data;
        this.error = error;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Objects.equals(data, result.data) && Objects.equals(error, result.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, error);
    }

    @Override
    public String toString() {
        return "Result{" +
                "data=" + data +
                ", error=" + error +
                '}';
    }
}
