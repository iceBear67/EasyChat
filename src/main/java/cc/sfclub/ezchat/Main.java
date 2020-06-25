package cc.sfclub.ezchat;

import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    @Getter
    private static final Logger LOGGER= LoggerFactory.getLogger(Main.class);
    public static void main(String[] args){
        LOGGER.info("EasyChat Starting..");
    }
}
