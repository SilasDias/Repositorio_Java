class ArranjoQuestao6 {
public static void main(String[] args)
{
int[] A = {2,3,4,5,6};
int[] B = new int [A.length];
System.out.println(A[2]);
B = A;
B[2] = 1;
System.out.println(A[2]);
}
}
