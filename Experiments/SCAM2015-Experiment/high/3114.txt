first.shoot(second);

public void shoot(Droid second) {
    second.absorbImpact(getImpact());
}

public void absorbImpact(int impact) {
    power -= impact;
}