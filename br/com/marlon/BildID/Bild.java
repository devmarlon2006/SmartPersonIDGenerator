package br.com.marlon.BildID;
import br.com.marlon.InputInfo.UserInput;

public class Bild {

    public String idNameBild(){
        IDelemnt newIDBild = new IDelemnt();

        UserInput newIDBild1 = new UserInput();

        String idNameBild1 = "";
        String idchar1 = idNameBild1 + newIDBild.BildIDElement1(newIDBild1.nameIN());

        String idchar2 = idNameBild1 + newIDBild.BildIDElement2();

        String idchar3 = idNameBild1 + newIDBild.BildIDElement3();

        String idchar4 = idNameBild1 + newIDBild.BildIDElement4();

        String idchar5 = idNameBild1 + newIDBild.BildIDElement5();

        String idchar6 = idNameBild1 + newIDBild.BildIDElement6();

        String idchar7 = idNameBild1 + newIDBild.BildIDElement7();

        String idchar8 = idNameBild1 + newIDBild.BildIDElement8();

        String idchar9 = idNameBild1 + newIDBild.BildIDElement9();

        String idchar10 = idNameBild1 + newIDBild.BildIDElement10();

        String idchar11 = idNameBild1 + newIDBild.BildIDElement11();

        return idchar1 + idchar2 + idchar3 + idchar4 + idchar5 + idchar6 + idchar7 + idchar8 + idchar9 + idchar10 + idchar11;
    }


}

class IDelemnt{

    char BildIDElement1(String IDElement1){


        String allowedCharacters = "";

        char idchar1 = IDElement1.charAt( 0 ) ;

        switch (idchar1) {
            case 'A':
                allowedCharacters = "8574359rufda";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'B':
                allowedCharacters = "8759521laker";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'C':
                allowedCharacters = "75200523trwtrw";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'D':
                allowedCharacters = "nfshj721242";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'E':
                allowedCharacters = "word3241fds";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'F':
                allowedCharacters = "32426bbfsd224";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'G':
                allowedCharacters = "mfsy727842kv";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'H':
                allowedCharacters = "08328hjnksdçpuq";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'I':
                allowedCharacters = "nbgfggywtwqwzxcv5890923";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'J':
                allowedCharacters = "ad3554019ofs";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'K':
                allowedCharacters = "nfhjsui24327561";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'L':
                allowedCharacters = "8574359rufda";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'M':
                allowedCharacters = "005432919jkfsa";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'N':
                allowedCharacters = "bvvnbxczbmbn8671244322006";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'O':
                allowedCharacters = "88783jfdvburwkiy";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'P':
                allowedCharacters = "mlkavggf36428600653";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'Q':
                allowedCharacters = "mnjf762avfrsvmybvd";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'R':
                allowedCharacters = "hkj543sdg";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'S':
                allowedCharacters = "74280efsd";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'T':
                allowedCharacters = "knfsk2432";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'U':
                allowedCharacters = "inbv82145";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'V':
                allowedCharacters = "813879qfv";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'W':
                allowedCharacters = "8574359rufda";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'X':
                allowedCharacters = "nna224145fdsf";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'Y':
                allowedCharacters = "091345hkqr";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'Z':
                allowedCharacters = "23432807adhvf642";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;

        };

        return idchar1;
    }

    char BildIDElement2(){
        char IDElement2 = '0';
        return IDElement2;
    }

    char BildIDElement3(){
        char IDElement3 = '0';
        return IDElement3;
    }

    char BildIDElement4(){
        char IDElement4 = '0';
        return IDElement4;
    }

    char BildIDElement5(){
        char IDElement5 = '0';
        return IDElement5;
    }

    char BildIDElement6(){
        char IDElement6 = '0';
        return IDElement6;
    }

    char BildIDElement7(){
        return '-';
    }

    char BildIDElement8(){
        char IDElement8 = '0';
        return IDElement8;
    }

    char BildIDElement9(){
        char IDElement9 = '0';
        return IDElement9;
    }

    char BildIDElement10(){
        char IDElement10 = '0';
        return IDElement10;
    }

    char BildIDElement11(){
        char IDElement11 = '0';
        return IDElement11;
    }

}


