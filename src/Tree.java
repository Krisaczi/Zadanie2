    public class Tree {

        private Node lacznik = null;

        public void add(int value) {
            if(this.lacznik == null) {
                this.lacznik = new Node();
                this.lacznik.setWartosc(value);
            } else {
                addRecursive(value, this.lacznik);
            }
        }

        public boolean zawiera(int value) {
            return containsRecursive(value, this.lacznik);
        }

        public int maksimum() {
            return maxRecursive(this.lacznik);
        }

        public int minimum() {
            return minRecursive(this.lacznik);
        }

        private void addRecursive(int value, Node node) {
            if(node.getWartosc() == value) {
                return;
            }
            if(node.getWartosc() < value) {
                if(node.getPrawaOdnoga() == null) {
                    node.setRightNode(new Node());
                    node.getPrawaOdnoga().setWartosc(value);
                } else {
                    addRecursive(value, node.getPrawaOdnoga());
                }
            } else {
                if(node.getLewaOdnoga() == null) {
                    node.setLewaOdnoga(new Node());
                    node.getLewaOdnoga().setWartosc(value);
                } else {
                    addRecursive(value, node.getLewaOdnoga());
                }
            }
        }

        private int minRecursive(Node node) {

            return node.getLewaOdnoga() == null ? node.getWartosc() : minRecursive(node.getLewaOdnoga());

        }

        private int maxRecursive(Node node) {
            return node.getPrawaOdnoga() == null ? node.getWartosc() : maxRecursive(node.getPrawaOdnoga());
        }

        private boolean containsRecursive(int value, Node node) {
            if (node == null) {
                return false;
            }
            if (value == node.getWartosc()) {
                return true;
            } else if (value > node.getWartosc()) {
                return containsRecursive(value, node.getPrawaOdnoga());
            } else {
                return containsRecursive(value, node.getLewaOdnoga());
            }
        }
}


