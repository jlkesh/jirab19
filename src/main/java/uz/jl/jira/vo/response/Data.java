package uz.jl.jira.vo.response;

import lombok.Getter;

/**
 * @author "Elmurodov Javohir"
 * @since 14/06/22/15:09 (Tuesday)
 * jira/IntelliJ IDEA
 */

@Getter
public class Data<T> {
    private T body;
    private Integer total;


    public Data(T body) {
        this.body = body;
    }

    public Data(T body, Integer total) {
        this.body = body;
        this.total = total;
    }
}
