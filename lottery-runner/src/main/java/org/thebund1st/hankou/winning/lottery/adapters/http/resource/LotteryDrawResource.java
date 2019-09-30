package org.thebund1st.hankou.winning.lottery.adapters.http.resource;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.thebund1st.hankou.winning.lottery.domain.LotteryWinning;

@Data
@NoArgsConstructor
public class LotteryDrawResource {

    private boolean won;

    private LotteryWinning reward;

    private LotteryDrawResource(boolean won) {
        this.won = won;
    }

    public static LotteryDrawResource noLuck() {
        return new LotteryDrawResource(false);
    }

    public static LotteryDrawResource from(LotteryWinning winning) {
        LotteryDrawResource resource = new LotteryDrawResource(true);
        resource.setReward(winning);
        return resource;
    }
}
