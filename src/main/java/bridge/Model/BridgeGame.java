package bridge.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {

    public void move(BridgeDTO bridgeDTO) {
        bridgeDTO.setMovePoint(bridgeDTO.getMovePoint() + 1);
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry(BridgeDTO bridgeDTO) {
        bridgeDTO.setMovePoint(0);
        bridgeDTO.clearInitializeLine();
        bridgeDTO.setRetry(bridgeDTO.getRetry() + 1);
    }
}
