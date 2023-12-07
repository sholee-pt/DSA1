package dList;
public class DNode <E> {
		private E     item;
		private DNode next;
		private DNode previous;
		
		public DNode(E newItem, DNode p, DNode q){ // 노드 생성자
			item     = newItem;
			previous = p;
			next     = q;
		}
		// get 메소드와 set 메소드
		public E     getItem()     { return item;}
		public DNode getNext()     { return next;}
		public DNode getPrevious() { return previous;}
		public void  setItem(E newItem)   { item     = newItem;}
		public void  setNext(DNode q)     { next     = q;}
		public void  setPrevious(DNode p) { previous = p;}
	}
