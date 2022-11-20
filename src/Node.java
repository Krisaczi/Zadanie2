

    public class Node {
        private int wartosc;
        private Node lewaOdnoga = null;
        private Node prawaOdnoga = null;


        public int getWartosc() {
            return wartosc;
        }

        public void setWartosc(int value) {
            this.wartosc = value;
        }

        public Node getLewaOdnoga() {
            return lewaOdnoga;
        }

        public void setLewaOdnoga(Node leftNode) {
            this.lewaOdnoga = leftNode;
        }

        public Node getPrawaOdnoga() {
            return prawaOdnoga;
        }

        public void setRightNode(Node rightNode) {
            this.prawaOdnoga = rightNode;
        }
    }
