package DAY10;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
       /* �޴��� ��� �� �޴��� �´� ����� �����ϵ��� �ڵ带 �ۼ��ϼ���.
        * �޴�
        * 1. ä�� UP
        * 2. ä�� DOWN
        * 3. ä�� ����
        * 4. ���� UP
        * 5. ���� DOWN
        * 6. ����
        * 7. ���� */
    
        /* �޴��� �����ϼ��� : 6
        * TV�� �׽��ϴ�.
        * 1. ä�� UP
        * 2. ä�� DOWN
        * 3. ä�� ����
        * 4. ���� UP
        * 5. ���� DOWN
        * 6. ����
        * 7. ����
        * �޴��� �����ϼ��� : 3
        * ä�� �Է� : 100
        * ä�� : 100
        * �޴�
        * 1. ä�� UP
        * 2. ä�� DOWN
        * 3. ä�� ����
        * 4. ���� UP
        * 5. ���� DOWN
        * 6. ����
        * 7. ����  
        * �޴��� �����ϼ��� : 7
	    */
        Scanner scan = new Scanner(System.in);
        RemoteController rm = new RemoteController(1, 10);
        int menu = -1;
        for ( ; menu != 7 ; ) {
 	    System.out.println("�޴� : ");
 	    System.out.println("1.ä�� UP : ");
 	    System.out.println("2.ä�� DOWN : ");
 	    System.out.println("3.ä�� ���� : ");
 	    System.out.println("4.���� UP : ");
 	    System.out.println("5.���� DOWN : ");
 	    System.out.println("6.���� : ");
 	    System.out.println("7.���� : ");
 	    System.out.println("�޴��� �����ϼ��� : ");
 	    menu = scan.nextInt();
 	    switch(menu) {
 	      case 1 : rm.channelUp();
     	      break;
	      case 2 : rm.channelDown();
	    	  break;
	      case 3 : 
              System.out.println("ä�� �Է� : ");
	          int ch = scan.nextInt();
	          rm.channel(ch);
	    	  break;
	      case 4 : rm.volumeUp();
	    	  break;
	      case 5 : rm.volumeDown();
	    	  break;
	      case 6 : rm.turn();
	    	  break;
	      case 7 :
	    	  System.out.println("���α׷� ����");
	    	  break;
	      default :
	    	  System.out.println("�߸��� �޴��Դϴ�.");
	      }
       }
 	   scan.close();
}



/* TV ������ Ŭ������ �����ϰ�, ��ü�� ���� �� ��ɵ��� �׽�Ʈ�غ�����. */
class RemoteController{                                                                                                                  
    //����, ä��, ����
	boolean power;
	int channel;
	int volume;
	int minVolume = 0;
	int maxVolume = 32;
	int minChannel = 1;
	int maxChannel = 999;
	/* ��� : TV�� �Ѵ� �޼ҵ�
	 * �Ű����� : ����
	 * ����Ÿ�� : ����
	 * �޼ҵ�� : trunOn
	 */
	void turnOn() {
		power = true;
		System.out.println("TV�� �ֽ��ϴ�.");
	}

	/* ��� : TV�� �Ѵ� �޼ҵ�
	 * �Ű����� : ����
	 * ����Ÿ�� : ����
	 * �޼ҵ�� : trunOff
	 */
	void turnOff() {
		power = false;
		System.out.println("TV�� �����ϴ�.");
	}
	/* ��� : TV�� Ű�ų� ���� �޼ҵ�
	 * �Ű����� : ����
	 * ����Ÿ�� : ���� => void
	 * �޼ҵ�� : turn
	 */
	void turn() {
		power = !power;
		if(power) {
			System.out.println("TV�� �ֽ��ϴ�.");
		}else {
			System.out.println("TV�� �����ϴ�.");
		}
	}
    /* ��� : �Ҹ��� ��ĭ �ø��� ���
     * �Ű����� : ����
     * ����Ÿ�� : ���� => void
     * �޼ҵ�� : volumeUp 
     */
	void volumeUp( ) {
		//������ �����ְ�, �Ҹ��� �ִ�ġ�� �ƴϸ�
		if(power) {
			if(volume < maxVolume) {
				volume--;
			}
			System.out.println("�Ҹ� : " + volume);
		}
	}
	void volumeDown( ) {
		//������ �����ְ�, �Ҹ��� �ִ�ġ�� �ƴϸ�
		if(power) {
			if(volume < maxVolume) {
				volume--;
			}
			System.out.println("�Ҹ� : " + volume);
		}
	}
	/* ��� : ü���� 1�� �����ϴ� �޼ҵ�
	 * �Ű����� : ����
	 * ����Ÿ�� : ����
	 * �Ű������� channelUp
	 */
	void channelUp( ) {
		if(power) {
			if(channel < maxChannel)
				channel++;
		}
		System.out.println("ä�� : " + channel);
	}
	/* ��� : ü���� 1�� �����ϴ� �޼ҵ�
	 * �Ű����� : ����
	 * ����Ÿ�� : ����
	 * �Ű������� channelDown
	 */
	void channelDown( ) {
		if(power) {
			if(channel < maxChannel) {
				channel--;
		    }
	    	System.out.println("ä�� : " + channel);
	    }
	}	
	/* ��� : �Է��� ä�η� �̵��ϴ� �޼ҵ�
	 * �Ű����� : �̵��� ä�� +> int ch
	 * ����Ÿ�� : ���� => void
	 * �޼ҵ�� : channel
	 */
	void channel(int ch) {
		if(power) {
			if(ch < minChannel)
			channel = minChannel;
		}	
		else if(ch > maxChannel) {
			channel = maxChannel;
		}
		else {
		    channel = ch;
	    }
		System.out.println("ä�� : " + channel);
	}
}
	public void RemoteController() {
		      channel = minChannel;
		      volume = minVolume;
	}
	public void RemoteController(int ch, int v) {
		if(ch >=  minChannel && ch <= maxChannel) {
			   channel = ch;
	    }else {
		       channel = minChannel;
	    }
	    if(v >=  minChannel && v <= maxChannel) {
		       volume = v;
	    }else {
		       volume = minVolume;
	   }
    } 
}
  