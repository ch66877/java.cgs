package DAY12;

import java.util.Scanner;

public class EX7 {

	/* �����/�ڽ����ڸ� �����ϴ� ��Ʈ(������ �ִ� 30�� - �����+�ڽ���������)
	 * 1. ��ǰ���(�űԵ��)
	 * 2. ��ǰ�԰�
	 * 3. ��ǰ ����
	 * 4. ��ǰ ����
	 * 5. ���α׷� ����
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//��ǰ�� �����ϱ� ���� �迭, ��Ʈ���� �Ǹ��ϴ� ��ǰ ���(�����+�ڽ�����)
		product list[] = new product[30];
		//�ٱ��� ����. ������ �ִ� 30��
        product basket[] = new product[30];
        
        //����� �Ǹ� ��ǰ ����
        int listCount = 0;
        //��ٱ��Ͽ� ��� ��ǰ ����
        int basketCount = 0;
        
        int menu, subMenu;
    
        do {
        	//�޴� ��� �� �޴��� ����
        	menu = selectMenu(scan);
        	switch(menu) {
        	//������ �޴��� 1�̸�(��ǰ ���)
        	case 1:
        		//���� �޴� ��� �� ���� �޴��� ����
        		subMenu = selectMenu(scan);
        		
        		switch(subMenu) {
        		//�ùٸ� ����޴��� �����ϸ�
        		case 1:  case 2:
        			//��ǰ ������ �Է¹޾Ƽ� �Ǹ���ǰ����Ʈ�� �߰�
        			list[listCount] = createProduct(subMenu,scan);
        			//�Ǹ� ��ǰ ���� ����
        			listCount++;
        			break;
        		//�߸��� ����޴��� �����ϸ�	
        		default:
        			System.out.println("������ �� ���� �����Դϴ�.");
         		}
        		break;
        	//������ �޴��� 2�̸�(��ǰ	�԰�)
        	case 2:
        		//�԰� ������ ��ǰ���� ���
        		printProductList(list, listCount);
        		//��ǰ�� �����ϰ� �԰��� ������ �����ؼ� �Ǹ���ǰ����Ʈ�� ��ǰ�� �԰� �Ǹ�
        		if(addAmountProductList(scan, list, listCount)) {
        			System.out.println("�԰� �Ϸ�Ǿ����ϴ�.");
        		}else {
        			System.out.println("�԰� �����߽��ϴ�.");
        		}
        		break;
        	case 3:
        		//�����ϱ� ���� �Ǹ���ǰ����Ʈ�� ���
        		printProductList(list, listCount);
        		//��ǰ�� �����ϰ� ������ ������
        		product selectProduct = selectProduct(scan, list, listCount);
        		//���õ� ��ǰ�� ������
        		if(selectProduct != null) {
        			//��ٱ��Ͽ� ���õ� ��ǰ�� ���
        			basket[basketCount] = selectProduct;
        			//��ٱ��Ͽ� ��� ������ �ϳ� ����
        			basketCount++;
        			//��ٱ��Ͽ� �ִ� ����� ���
        			printProductList(basket, basketCount);
        		}else {
        			System.out.println("���õ� ��ǰ�� �����ϴ�.");
        		}
        		break;
        	case 4:
        		//��ٱ��Ͽ� �ִ� ����� ���
        		printProductList(basket, basketCount);
        		//��ٱ��Ͽ� �ִ� ����� �����հ� ���
        		int sum = sumProductList(basket, basketCount);
        		System.out.println("���� �� �ݾ� : " + sum);
        		
        		//���� �ݾ��� �Է�
                System.out.println("�ݾ��� �Է��ϼ��� : ");
                int buyPrice = scan.nextInt();
                
                
                //�ݾ��� �����ϸ�
                if(sum > buyPrice) {
                	//���縦 ����Ұ��� ���
                	System.out.println("���縦 ����ϰڽ��ϱ�?(��ҽ� ��ٱ��ϴ� ������ϴ�. y/n) : ");
                	char cancel = scan.next().charAt(0);
                	//����ϸ�
                	if(cancel == 'y' || cancel == 'y') {
                		//��ٱ��Ͽ� ��� ��ǰ���� ��Ʈ�� �����־����
                		returnProductList(list, listCount, basket, basketCount);
                		//��ٱ��ϸ� ���
                		basketCount = 0;	
                 	}
                }
            
                //���簡 ���������� �Ϸ�Ǹ�
                else {
                	//�Ž������� ����ϰ�
                	System.out.println("�Ž����� : " + (buyPrice - sum) + "��");
                	//�ٱ��ϸ� ���
                	basketCount = 0;
                }
        		break;
        	case 5: System.out.println("���α׷��� �����մϴ�.");
        		break;
        	default:
        	}	
        }while(menu != 5);
        scan.close();
     }
	/* ��� : �޴��� ����ϰ�, �޴��� Scanner�� ���� �Է¹޾� �Է¹��� �޴��� �˷��ִ� �޼ҵ�
	 * �ްԹ��� : Scanner => Scanner scan
	 * ����Ÿ�� : �Է¹��� �޴� => ���� => int
	 * �޼ҵ�� �� selectMenu
	 * */
	 public static int selectMenu(Scanner scan) {
		System.out.println("====�޴�====");
     	System.out.println("1. ��ǰ ���(������)");
     	System.out.println("2. ��ǰ �԰�(������)");
     	System.out.println("3. ��ǰ ����(��)");
     	System.out.println("4. ��ǰ ����(��)");
     	System.out.println("5. ���α׷� ����");
     	System.out.println("�޴� ���� : ");
     	int menu = scan.nextInt();
        System.out.println("============");
        return menu;
	 }
	 /* ��� : ��ǰ��Ͽ� ���� ���� �޴��� ����ϰ�, Scanner�� ���� ���� �޴��� �Է¹޾� ����޴��� �˷��ִ� �޼ҵ�
      * �ްԹ��� : Scanner => Scanner scan
 	  * ����Ÿ�� : �Է¹��� �޴� => ���� => int
	  * �޼ҵ�� �� selectSubMenu
	  */
	 public static int selectSubMenu(Scanner scan) {
		 System.out.println("1. ����� ���");
 		 System.out.println("2. �ڽ����� ���");
 		 System.out.println("���� ���� : ");
 		 return scan.nextInt();
	 }
     /* ��� : ������ subMenu�� �´� ��ǰ ������ Scanner�� ���� �Է¹޾� ��ǰ ��ü�� ������ �� ������ ��ǰ��
              �˷��ִ� �޼ҵ�
      * �ް����� : ������ ����޴�, ��ĳ�� => int subMenu, Scanner scan
      * ����Ÿ�� : ������ ��ǰ => Product
      * �޼ҵ�� : createProduct
      */
	 public static product createProduct(int subMenu, Scanner scan) {
		 //����ϱ� ���� ����� ��ǰ ������ �Է�
		 System.out.println("��ǰ�� :");
 		 String name = scan.next();
 		 System.out.println("���� :");
 		 int price = scan.nextInt();
 		 System.out.println("���� : ");
 		 int amount = scan.nextInt();
 		
 		 //������ ������ ���� �߰� ������ �Է�
		 switch(subMenu) {
		 case 1:
			 System.out.println("����� �뷮 : ");
	 		 int capacity = scan.nextInt();
	 		 //�Էµ� ������ �̿��Ͽ� ������� �����Ͽ� ������
	 		 return new Drink(name, price, amount, capacity);
		 case 2:
			 System.out.println("�ڽ��� ���� : ");
	 		 int count = scan.nextInt();
	 		 //�Էµ� ������ �̿��Ͽ� �ڽ����ڸ� �����Ͽ� ������
			 return new Drink(name, price, amount, count);
		//�߸��� ������ �����ϸ� ���ٶ�� �˷���	 
		 default:
			 return null;
		 }
	 }
	 /* ��� : ��ǰ����� ����ϴ� �޼ҵ� 
	  * �Ű����� : ��ǰ��� => Product ProductList[], int listCount
	  * ����Ÿ�� : ���� => void
	  * �޼ҵ�� : printProductlist */
	 public static void printProductList(product ProductList[], int listCount) {
		 if(ProductList == null || listCount == 0) {
			 System.out.println("��ϵ� ��ǰ�� �����ϴ�. ");
			 return;
		 }
		 for(int i = 0; i<listCount; i++) {
			 System.out.print(i+1 + ".");
			 ProductList[i].print();
 		}
	 }
	 /* ��� : Scanner�� �̿��Ͽ� ��ǰ ��Ͽ��� ��ǰ�� ������ �Է��Ͽ� ������ �߰��ϴ� �޼ҵ�
	  * �Ű����� : Scanner, ��ǰ ��� => Scanner scan, Product list[], int listCount
	  * ����Ÿ�� : �԰� ���� => boolean
	  * �޼ҵ�� : addAmountProductList
	  */
	 public static boolean addAmountProductList(Scanner scan, product list[], int listCount) {
		 if(list == null || listCount == 0) {
			 return false;
		}
		//�԰��� ��ǰ�� ���� 
		System.out.println("�԰��� ��ǰ�� �����ϼ��� : ");
 		int num =scan.nextInt();
 		//�԰��� ��ǰ ������ ����
 		System.out.println("�԰��� ��ǰ�� ������ �Է��ϼ��� : ");
 		int amount = scan.nextInt();
 		//��ǰ������ �߸��߰ų� ������ �߸� ������ ��� �԰� �����ߴٰ� �˷���
 		if(num < 1 || num > listCount || amount <= 0) {
 			return false;
 		}
 		//���õ� ��ǰ�� �԰�� ������ �߰�
 		list[num-1].sumAmount(amount);
 		//�԰� �Ϸ�ƴٰ� �˷���
 		return false;
	 }
	 /* ��� : ��ĳ�ʸ� �̿��Ͽ� ��ǰ�� ������ �����ϸ� 
	  *       ��ǰ����Ʈ���� �ش� ��ǰ�� ������ �°� ������ ��ǰ�� �����ִ� �޼ҵ�
	  * �Ű����� : ��ĳ��, ��ǰ����Ʈ(��Ʈ) => Scanner scan, product list[], int listCount
	  * ����Ÿ�� : ���õ� ��ǰ(�Է��� ��������) => product
	  * �޼ҵ�� : selectProduct
	  */
	 public static product selectProduct(Scanner scan, product list[], int listCount) {
		System.out.println("������ ��ǰ�� �����ϼ��� : ");
  		int num =scan.nextInt();
  		//�߸��� ��ǰ�� �����ϸ� ��ǰ�� ���ٰ� �˷���
  		if(num > listCount) {
  			return null;
  		}
  		//��ǰ�� ������ ������ ������ ����
  		System.out.println("������ ��ǰ�� ������ �Է��ϼ��� : ");
  		int amount = scan.nextInt();
  		
  		//������ ��ǰ�� �����ؼ� ������
  		product buyProduct = list[num-1];
  		product selectProduct = null;
  		//���õ� ��ǰ�� �����ؼ� ������
  		if(buyProduct instanceof SnakBox) {
  			selectProduct = new SnakBox((SnakBox)buyProduct);
  		}else if(buyProduct instanceof Drink) {
  			return new Drink((Drink)buyProduct);
  		}else {
  			return null;
  		}
  	    //������� ���� ������ �Է��� ���
 		if(buyProduct.getAmount() < amount) {
 			//������ ������� ����
 	        amount = buyProduct.getAmount();
 		}
 		//������ ��ǰ ������ ������ �������� ����
  		selectProduct.setAmount(amount);
  		//�Ǹ���ǰ ����Ʈ���� ������ ������ ����
  		buyProduct.sumAmount(-amount);
  		//������ ��ǰ�� �˷���
  		return selectProduct;
	 }
     /* ��� : ��ǰ ����Ʈ�� �־����� �ش� ��ǰ ����Ʈ�� �հ踦 ���Ͽ� �˷��ִ� �޼ҵ�
      * �Ű����� : ��ǰ ����Ʈ => product list[], int listCount
      * ����Ÿ�� : �հ� => int
      * �޼ҵ�� : sumProductList
      */
	 public static int sumProductList(product list[], int listCount) {
		 int sum = 0;
		 for(int i = 0; i<listCount; i++) {
			 sum += list[i].getPrice() * list[i].getAmount();
		 }
		 return sum;
	 }
	 /* ��� : ��ٱ��Ͽ� ���� ��ǰ���� ���Ͽ� �����ִ� �޼ҵ�
	  * �Ű����� : ������ǰ����Ʈ, ��ٱ��ϸ���Ʈ => product list[], int ListCount, product basket[], int basketCount
	  * ����Ÿ�� : ���� => void
	  * �޼ҵ�� : returnProductList
	  */
	 public static void returnProductList(product list[], int ListCount, product basket[], int basketCount) {

	 if(list == null || basket == null) {
		 return;
	 }
	 //�Ǹ� ��ǰ ��ϰ� ��ٱ��� ����� �ϳ��� ���Ͽ� ���ڸ��� ������ ����
	 for(int i = 0; i<ListCount; i++) {
			for(int j = 0; j<basketCount; j++) {
				product pi = list[i];//�Ǹ� ��ǰ
				product pj = basket[j];//��ٱ��� ��ǰ
				//�Ǹ���ǰ �̸��� ��ٱ��� ��ǰ �̸��� ������
				if(pi.getName().equals(pj.getName())) {
					//pi.amount : ���, pj.amount : �����Ϸ��� �����ߴ� ����
					//��ٱ��Ͽ� �ִ� ��ǰ�� ���ڸ��� ���� ���� : �Ǹ���ǰ ������ ��ٱ��� ��ǰ�� ������ �߰�
					pi.sumAmount(pj.getAmount());
				}
            }
	   }
   }
}