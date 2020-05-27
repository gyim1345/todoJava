package todoapp.ui;

public class UIServices {


    public static void view(String string) {

        if(string.equals("App 시작")){
            Scripts.printEntryScript();
        }
        if(string.equals("Todo 시작")){
            Scripts.printTodoScript();
        }
        if(string.equals("Completed Todo 시작")){
            Scripts.printCompletedTodoScript();
        }
        if(string.equals("App 중지")){
            Scripts.printExitScript();
        }
        if(string.equals("Todo 등록 시작")){
            Scripts.printBeforeAddScript();
        }
        if(string.equals("Todo 등록 종료")){
            Scripts.printAfterAddScript();
        }
        if(string.equals("Todo 출력 시작")){
            Scripts.printBeforeListAllTodosScript();
        }
        if(string.equals("Todo 완료 하기 시작")){
            Scripts.printBeforeCompleteScript();
        }
        if(string.equals("Todo 삭제 하기 시작")){
            Scripts.printBeforeDeleteScript();
        }
        if(string.equals("Todo 우선 순위 변경 시작")){
            Scripts.printBeforeChangePriorityScript();
        }
        if(string.equals("Todo 우선 순위 두번째 입력값 받기 시작")){
            Scripts.printAfterPriorityScript();
        }
        if(string.equals("Todo 제목 바꾸기 시작")){
            Scripts.printTargetEditScript();
        }
        if(string.equals("Todo 제목 바꾸기 두번째 입력값 받기")){
            Scripts.printModifyToEditScript();
        }
        if(string.equals("Completed todo 출력")){
            Scripts.printBeforeListAllCompletedTodoScript();
        }
        if(string.equals("aaaaaaaaaaaaaaaaaaaa")){
            Scripts.printEntryScript();
        }
        if(string.equals("Complete Todo 삭제 시작")){
            Scripts.printBeforeRemoveCompletedTodoScript();
        }
        if(string.equals("에러")){
            Scripts.printErrorScript();
        }

    }
}
