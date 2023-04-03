package me.ghisiluizgustavo.tccpf.response;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import me.ghisiluizgustavo.tccpf.enums.CpfStatus;

@Data
@Builder
@ToString
public class CpfResponseValidation {

    private CpfStatus status;
}
