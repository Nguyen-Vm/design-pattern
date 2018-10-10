package org.linker._20_bridge;

/**
 * @author RWM
 * @date 2018/10/10
 */
public abstract class HandsetBrand {
    protected HandsetSoft soft;

    public void setSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    public abstract void run();
}
