package todoapp.ui;

public enum Commands {
//    임의의_초기값(-1) {
//        public void getScript() {
//            return ;}
//    },

//    TODO_출력(2) {
//        public void getScript() {
//            return ;
//        }
//    },
//    TODO_완료(3) {
//        public void getScript() {
//            return ;
//        }
//    },
//    TODO_삭제(4) {
//        public void getScript() {
//            return ;
//        }
//    },
//    TODO_우선_순위_변경(5) {
//        public void getScript() {
//            return ;
//        }
//    },
//    TODO_제목_바꾸기(6) {
//        public void getScript() {
//            return ;
//        }
//    },
//    되돌아가기(0) {
//        public void getScript() {
//            return ;
//        }
//    },
//    APP_중지(0) {
//        public void getScript() {
//            return ;
//        }
//    },
//    COMPLETE_TODO_출력(1) {
//        public void getScript() {
//            return ;
//        }
//    },
//    COMPLETE_TODO_삭제(2) {
//        public void getScript() {
//            return ;
//        }
//    },
//    TODO_조작(1) {
//        public void getScript() {
//            return ;
//        }
//    },
//    COMPLETED_TODO_조작(2) {
//        public void getScript() {
//            return ;
//        }
//    },
//    TODO_명령어_갯수(6) {
//        public void getScript() {
//            return ;
//        }
//    },
//    COMPLETE_TODO_명령어_갯수(2) {
//        public void getScript() {
//            return;
//        }
//    },
//    ENTRY_명령어_갯수(2) {
//        public void getScript() {
//            return;
//        }
//    };

    TODO_등록(1) {
    public int getScript(int a) {
        System.out.println("fuckyou");
    return 1;
        }
};


    private int command;

    Commands(int command) {
        this.command = command;
    }

    public int getCommand() { return command; }
    public abstract int getScript(int a);
}
