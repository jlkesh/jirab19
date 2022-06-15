package uz.jl.jira.vo.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * @author "Elmurodov Javohir"
 * @since 14/06/22/15:13 (Tuesday)
 * jira/IntelliJ IDEA
 */

@Setter
@Getter
@Builder
public class ErrorVO {
    private String friendlyMessage;
    private String developerMessage;
    private Integer status;
    private Timestamp timestamp;
}
