interface BallVisitor {
    void visit(LegalBall l);
    void visit(IllegalBall i);
}

interface Ball {
    void accept(BallVisitor v);
}

class LegalBall implements Ball {
    void accept(BallVisitor v) {
        v.visit(this);
    }
}

class IllegalBall implements Ball {
    void accept(BallVisitor v) {
        v.visit(this);
    }
}

class Basket implements BallVisitor {
    void visit(LegalBall l) {
        System.out.println("LegalBall added to basket");
    }

    void visit(IllegalBall i) {
        System.out.println("IllegalBall added to basket");
    }
}