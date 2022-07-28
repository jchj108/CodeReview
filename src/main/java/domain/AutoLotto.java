package domain;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AutoLotto {

    private final List<LottoTicket> list = new ArrayList<LottoTicket>();
    public static final long cost = 1000;

    public List<LottoTicket> getTicket(long payment) {
        if (payment < cost) {
            throw new IllegalArgumentException("금액이 부족합니다.");
        }
        // while 대신 cost로 나눠서 티켓팅하기
        // while 가독성 문제
        while (payment >= cost) {
            payment -= cost;
            this.list.add(new LottoTicket());
        }
        return this.list;
    }


}
