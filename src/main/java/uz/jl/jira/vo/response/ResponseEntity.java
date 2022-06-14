package uz.jl.jira.vo.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import uz.jl.jira.vo.response.Data;

/**
 * @author "Elmurodov Javohir"
 * @since 14/06/22/15:10 (Tuesday)
 * jira/IntelliJ IDEA
 */

@Getter
@Setter
@ToString
public class ResponseEntity<T> {
    private T data;
    private ErrorVO error;
    private boolean success;


    public ResponseEntity(T data) {
        this.data = data;
        this.success = true;
    }

    public ResponseEntity(ErrorVO error) {
        this.error = error;
        this.success = false;
    }
}
