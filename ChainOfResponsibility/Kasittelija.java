public abstract class Kasittelija {
    private Kasittelija seuraava;

    public void asetaSeuraava(Kasittelija seuraava) {
        this.seuraava = seuraava;
    }

    public void kasittele(PalkankorotusPyynto pyynto) {
        if (seuraava != null) {
            seuraava.kasittele(pyynto);
        }
    }
}

class LahiEsimies extends Kasittelija {


    public void kasittele(PalkankorotusPyynto pyynto) {
        if (pyynto.getPyynto() <= 2.0) {
            System.out.println("Lähiesimies hyväksyy palkankorotuksen " + pyynto.getPyynto());
        } else {
            super.kasittele(pyynto);
        }
    }
}

class Paalikko extends Kasittelija {

    public void kasittele(PalkankorotusPyynto pyynto) {
        if (pyynto.getPyynto() <= 5.0) {
            System.out.println("Päällikkö hyväksyy palkankorotuksen " + pyynto.getPyynto());
        } else {
            super.kasittele(pyynto);
        }
    }
}

class Toimitusjohtaja extends Kasittelija {

    public void kasittele(PalkankorotusPyynto pyynto) {
        System.out.println("Toimitusjohtaja hyväksyy palkankorotuksen " + pyynto.getPyynto());
    }
}