package cn.parabola.ooki.server.logic.monster;

import cn.parabola.ooki.core.auto.GameProtos;
import cn.parabola.ooki.server.message.KHttpMessageHandler;

/**
 * Created by 熊纪元 on 2016/5/9.
 */
public class MonsterHandler extends KHttpMessageHandler {
    @Override
    public int handler(GameProtos.MessageBody messageBody) {
        return NOT_CATCH_HANDLER;
    }
}
