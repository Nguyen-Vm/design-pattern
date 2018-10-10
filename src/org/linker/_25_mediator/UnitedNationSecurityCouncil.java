package org.linker._25_mediator;

/**
 * @author RWM
 * @date 2018/10/10
 */
public class UnitedNationSecurityCouncil extends UnitedNations {

    private USA usa;

    private Iraq iraq;

    public USA getUsa() {
        return usa;
    }

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public Iraq getIraq() {
        return iraq;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    @Override
    public void declare(String message, Contury contury) {
        if (contury == usa) {
            iraq.getMessage(message);
        } else {
            usa.getMessage(message);
        }
    }
}
