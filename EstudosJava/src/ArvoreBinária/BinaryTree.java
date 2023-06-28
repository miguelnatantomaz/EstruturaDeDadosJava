package ArvoreBinária;

public class BinaryTree {
  private No root;

  public void insert(Integer valor) {
    insert(root, valor);
  }

  public void insert(No no, Integer value){
    if(no == null) {
      root = new No(value);
      return;
    }

    if(value >= no.info()){
      if(no.right() == null){
        no.setRight(new No(value));
        return;
      } 

      insert(no.right(), value);

    } else if(no.left() == null){

      no.setLeft(new No(value));
      return;
    } else {

      insert(no.left(), value);
    }
  }

  public void preOrder() {
    preOrder(root);
  }

  public void preOrder(No no) {
    if(no == null) return;

    System.out.print(no.info() + " - ");
    preOrder(no.left());    
    preOrder(no.right());

  }

  public void inOrder() {
    inOrder(root);
  }

  public void inOrder(No no) {
    if(no == null) return;

    inOrder(no.left());    
    System.out.print(no.info() + " - ");
    inOrder(no.right());
  }

  public void postOrder() {
    postOrder(root);
  }

  public void postOrder(No no) {
    if(no == null) return;

    postOrder(no.left());    
    postOrder(no.right());
    System.out.print(no.info() + " - ");
  }

  public No remove(BinaryTree tree, Integer value){
    No balance = remove(tree, root, value, null);

    return balance;
  }

  public No remove(BinaryTree tree, No no, Integer value, No dad){
    if(no != null){
      if(no.info() == value){

        if(no.left() == null && no.right() == null){ // Sem filhos -> Nó folha ou raiz
          if(dad == null) {
            tree.root = null;
          }

          if(no.info() >= dad.info()){
            dad.setRight(null);
          } else {
            dad.setLeft(null);
          }
        } else if(no.left() == null) { // Somente filhos direita

          if(no.info() >= dad.info()){ 
            dad.setRight(no.right());
          } else {
            dad.setLeft(no.right());
          }

          no.setLeft(null);

        } else if(no.right() == null) { // Somente filhos esquerda
          if(no.info() >= dad.info()){
            dad.setRight(no.left());
          } else {
            dad.setLeft(no.left());
          }

          no.setLeft(null);
        } else { // Dois filhos
          int above = aboveLeft(no).info();
          int noRemove = remove(tree, above).info();
          no.setInfo(noRemove);

          return no;
        }

      } 

      if(value >= no.info()){
        return remove(tree, no.right(), value, no);
      } else { 
        return remove(tree, no.left(), value, no);
      }
    }

    return null;
  }

  private No aboveLeft(No no) {
    if(no.left() != null){
      no = no.left();
      while(no.right() != null) {
        no = no.right();
      }

      return no;
    }

    return null;
  }

  public static void main(String[] args) throws Exception {
    BinaryTree a = new BinaryTree();

    a.insert(10);  
    a.insert(3);
    a.insert(5);    
    a.insert(20);   
    a.insert(30);     
    a.insert(40);
    a.insert(50);
    a.insert(60);

    System.out.print("Pre Order - " );
    a.preOrder();
    System.out.print("\n" );

    System.out.print("in Order - " );
    a.inOrder();
    System.out.print("\n" );

    System.out.print("Post Order - " );
    a.postOrder();
    System.out.print("\n" );

    a.remove(a, 5);

    System.out.print("\n");

    System.out.print("Pre Order - " );
    a.preOrder();
  }
}
