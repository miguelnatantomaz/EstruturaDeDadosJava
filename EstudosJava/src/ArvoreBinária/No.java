package ArvoreBinária;

public class No {
  private Integer info;
  private No left;
  private No right;

  public No(int info){
    this.info = info;
  }

  public Integer info() {
    return info;
  }

  public void setInfo(Integer info) {
    this.info = info;
  }

  public No left() {
    return left;
  }

  public void setLeft(No left) {
    this.left = left;
  }

  public No right() {
    return right;
  }

  public void setRight(No right) {
    this.right = right;
  }
}
