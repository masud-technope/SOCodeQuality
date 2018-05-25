class Basket {
    void AddBall(LegalBall l) {
        System.out.println("LegalBall added to basket");
    }

    void AddBall(IllegalBall i) {
        System.out.println("IllegalBall added to basket");
    }
}

interface Ball {
    void AddBall(Basket b);
}

class LegalBall implements Ball {
    void AddBall(Basket b) {
        b.AddBall(this);
    }
}

class IllegalBall implements Ball {
    void AddBall(Basket b) {
        b.AddBall(this);
    }
}