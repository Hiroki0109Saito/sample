package Y;

public class Y_18 {
	 
    // ���ܐ�
    private static final int QUEENS = 4;
    // ���܂̔z�u�ʒu 
    private static final int [] VERTICAL = new int [QUEENS];
    // �s�ɉ��܂��z�u����Ă邩�`�F�b�N�p  
    private static final boolean [] HORIZONTAL = new boolean [QUEENS]; 
    // �E�S�T�x�΂߃��C���ɉ��܂��z�u����Ă��邩�`�F�b�N�p
    private static final boolean [] DIP_POSITIVE = new boolean [QUEENS * 2 -1]; 
    // ���S�T�x�΂߃��C���ɉ��܂��z�u����Ă��邩�`�F�b�N�p
    private static final boolean [] DIP_NEGATIVE = new boolean [QUEENS * 2 - 1];
    // ���S 
    private static final boolean SAFE = false;
    // �댯 
    private static final boolean OUT = true;
    // �g�[�^���p�^�[���� 
    private static int counter; 
 
    public static void main(String[] args) {
        trySet(0);
        if(counter < 1){
            System.out.println("�z�u�s�\�ł����B");
        }else{
            System.out.println(counter + " �p�^�[���z�u�\�ł����B");
        }
    }
    
    // �S�Ẳ\�ȉ��܂̔z�u�ʒu���擾�A�����ăg�[�^���p�^�[�������擾����B
    private static void trySet(int i) {
        for (int j = 0; j < QUEENS; j++) {
            // �s ( j )�A�^�E�S�T�x�΂߃��C�� ( i + j )�A�_���S�T�x�΂߃��C�� (i - j + ( QUEENS -1 )) �z�u�`�F�b�N
         if (HORIZONTAL [j] == SAFE && DIP_POSITIVE [i + j] == SAFE && DIP_NEGATIVE [i - j + ( QUEENS -1)] == SAFE) { 
            VERTICAL [i] = j; // ���� i �� j �s�ɔz�u
            if (i == ( QUEENS -1)) { // ���܂̔z�u����
                 counter++; // �g�[�^���p�^�[�����J�E���^�[
                 printBoard(); // �Ֆʂ�\��
             }else {
                // ���܂̗����؁i�s�A�΂߁j���Z�b�g
               HORIZONTAL [j] = DIP_POSITIVE [i + j] = DIP_NEGATIVE [i - j + ( QUEENS -1)] = OUT;
               // ���̗��z�u
               trySet(i + 1);
               // ���܂̗����؁i�s�A�΂߁j������
               HORIZONTAL [j] = DIP_POSITIVE [i + j] = DIP_NEGATIVE [i - j + ( QUEENS -1)] = SAFE;
            }
         }
      }
    }
 
    // �S�Ẳ\�ȉ��ʔz�u�ʒu���o�́@�������܂��u���ꂽ�ꏊ�ł���B
    private static void printBoard() {
        System.out.println("�� " + counter + " �p�^�[��"); 
        for (int i = 0; i < QUEENS; i++) {
         for (int j = 0; j < QUEENS; j++) {
                System.out.printf("%s", j == VERTICAL [i] ? "�� " : "�� ");
            }
         System.out.println();
      }
      System.out.println();
 
    }
}