import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Bt1: Cho người dùng nhập vào số nguyên vào lưu trữ trong mảng
		 * a. làm menu
		 * 
		 * 
		 * */
		int arrLength = declareArrayLength();
		int [] arrMain = new int [arrLength];
		arrayInput(arrMain);
		//arrayOutput(arrMain);
		
		
		boolean isStop=false;
		while(!isStop){
			int opt = programMenu();
			switch (opt) {
				case 1: {
					// b. Tinh tong cac so duong trong mang
					sumPositiveValueInArray(arrMain);
					break;
				}
				case 2: {
					sumOddValueInArray(arrMain);
					break;
				}
				case 3: {
					countPositiveValueInArray(arrMain);
					break;
				}
				case 4: {
					findMinValueInArray(arrMain);
					break;
				}
				case 5: {
					findPositiveMinValueInArray(arrMain);
					break;
				}
				case 6: {
				    findLastEventValueInArray(arrMain);
					break;
				}
				case 7: {
					int rs7 = findFirstEventValueInArray(arrMain);
					break;
				}
				case 8: {
					int rs8 = findFirstPrimeNumberInArray(arrMain);
					break;
				}
				case 9: {
					int rs9 = findLastPositiveValueInArray(arrMain);
					break;
				}
				case 10: {
					int rs10 = findMinEvenValueInArray(arrMain);
					break;
				}
				case 0: {
					isStop = true;
					System.out.println("*** Thoat Chuong Trinh!");				
					break;
				}
				default: {
					break;
				}
			}
		}
	}
//***		Declare Function After There 
	

	
	public static int declareArrayLength() {
		int arrLength; 
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("Nhap vao do dai mang: ");
			arrLength = sc.nextInt();
		}while(arrLength<=0);
		return arrLength;
	}
	
	public static void arrayInput(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<arr.length;i++) {
			System.out.print("Nhap vao phan tu thu "+i+" : ");
			arr[i]=sc.nextInt();
		}
	}
	
	public static void arrayOutput(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.println("Gia tri tai index = "+i+" la: "+arr[i]);
		}
	}
	
	public static int programMenu() {
		try {
			int tmp;
			Scanner sc = new Scanner(System.in);
			do {
			System.out.println("____MENU____Array____Excercise____");
			System.out.println("Vui long chon 1 trong cac so duoi day:");
			System.out.println(" 1. Tong cac so duong");
			System.out.println(" 2. Tong cac so le");
			System.out.println(" 3. Dem bao nhiu so duong");
			System.out.println(" 4. Tim so nho nhat trong mang");
			System.out.println(" 5. Tim so duong nho nhat trong mang");
			System.out.println(" 6. Tim so chan cuoi cung trong mang 1 chieu cac so nguyen");
			System.out.println(" 7. Tim so chan dau tien trong mang 1 chieu cac so nguyen");
			System.out.println(" 8. Tim so nguyen to dau tien trong mang 1 chieu cac so nguyen");
			System.out.println(" 9. Tim so duong cuoi cung trong mang 1 chieu cac so nguyen");
			System.out.println("10. Tim gia tri chan nho nhat trong mang 1 chieu cac so nguyen");
			System.out.println("0. Dung chuong trinh");
			System.out.print(">>> So ban chon la: ");
			tmp = sc.nextInt();
			}while (tmp != 1 && tmp!=2 && tmp!=3 && tmp!=4 && tmp!=5 && tmp!=6 && tmp!=7  && tmp!=8  && tmp!=9 && tmp!=10 && tmp!=0);
			return tmp;
		}
		catch(Exception e) {
			System.out.println("*** Vui long nhap vao so nguyen");
			return -1;
		}
	}
	
	public static void sumPositiveValueInArray(int[] arr) {
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>0) {
				sum+=arr[i];
			}
		}
		System.out.println(">>> Tong cac so duong trong mang la: "+sum);
		System.out.println("");
	}
	
	public static void sumOddValueInArray(int[] arr) {
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]%2 != 0) {
				sum+=arr[i];
			}
		}
		System.out.println(">>> Tong cac so le trong mang la: "+sum);
		System.out.println("");
	}
	
	public static void countPositiveValueInArray(int[] arr) {
		int cnt=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>0) {
				cnt++;
			}
		}
		System.out.println(">>> Co " +cnt+" so duong trong mang");
		System.out.println("");
	}
	
	public static void findMinValueInArray(int[] arr) {
		int min = arr[0];
		for (int i=1;i<arr.length;i++) {
			if (arr[i]<=min) {
				min=arr[i];
			}
		}
		System.out.println(">>> So nho nhat trong mang la: "+min);
		System.out.println("");
	}
	
	public static void findPositiveMinValueInArray(int[] arr) {
		int minPos = 0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>0) {
				minPos = arr[i];
				for (int x=i;x<arr.length;x++) {
					if (arr[x]>0 && arr[x]<minPos) {
						minPos = arr[x];
					}
				}
			}
		}
		if(minPos == 0) {
			System.out.println(">>> Khong co so duong trong mang");
			System.out.println("");
		}
		else {
			System.out.println(">>> So duong nho nhat trong mang la: "+minPos);
			System.out.println("");
		}
	}
	
	public static int findLastEventValueInArray(int[] arr) {
		for (int i=(arr.length-1);i>=0;i--) {
			if (arr[i]%2==0) {
				System.out.println(">>> So chan cuoi cung cua mang la: "+arr[i]);
				System.out.println("");
				return arr[i];
			}
		}
		System.out.println(">>> Khong co gia tri chan trong mang");
		System.out.println("");
		return -1;
	}
	
	public static int findFirstEventValueInArray(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			if (arr[i]%2==0) {
				System.out.println(">>> So chan dau tien cua mang la: "+arr[i]);
				System.out.println("");
				return arr[i];
			}
		}
		System.out.println(">>> Khong co gia tri chan trong mang");
		System.out.println("");
		return -1;
	}
	
	
	
	public static boolean checkPrimeNumber(int x) {
		if (x >0) {
			for (int n=1;n<=x;n++) {
				if (((6*n)+1==x )|| ((6*n)-1)==x) return true;
			}
			if (x==2||x==3) return true;
			else return false;
		}
		else return false;
	}
	

	public static int findFirstPrimeNumberInArray(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			if (checkPrimeNumber(arr[i])) {
				System.out.println(">>> So nguyen to dau tien cua mang la: "+arr[i]);
				System.out.println("");
				return arr[i];
			}
		}
		System.out.println(">>> Khong co so nguyen to trong mang");
		System.out.println("");
		return -1;
	}
	
	public static int findLastPositiveValueInArray(int[] arr) {
		for (int i=(arr.length-1);i>=0;i--) {
			if (arr[i]>0) {
				System.out.println(">>> So duong cuoi cung cua mang la: "+arr[i]);
				System.out.println("");
				return arr[i];
			}
		}
		System.out.println(">>> Khong co so duong trong mang");
		System.out.println("");
		return -1;
	}
	
	public static int findMinEvenValueInArray(int[] arr) {
		int minEven;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]%2==0 && arr[i]!=0) {
				minEven = arr[i];
				for (int y=i;y<arr.length;y++) {
					if (arr[y]%2==0 && arr[y]<minEven) {
						minEven = arr[y];
					}
				}
				System.out.println(">>> So chan nho nhat cua mang la: "+minEven);
				System.out.println("");
				return minEven;
			}
		}
		System.out.println(">>> Khong co gia tri chan trong mang");
		System.out.println("");
		return -1;
	}
	
	
//***		End
}
