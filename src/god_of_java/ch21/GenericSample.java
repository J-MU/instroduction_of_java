package god_of_java.ch21;

public class GenericSample {

    public static void main(String[] args){
        GenericSample sample=new GenericSample();
        sample.checkCastingDTO();
        sample.checkGenericDTO();
    }

    public void checkCastingDTO(){
        System.out.println("<<  checkCastingDTO !!>>");
        CastingDTO dto1=new CastingDTO();
        dto1.setObject(new String("test String"));

        CastingDTO dto2=new CastingDTO();
        dto2.setObject(new StringBuffer("test String Buffer"));

        CastingDTO dto3=new CastingDTO();
        dto3.setObject(new StringBuilder("test String Builder"));

        checkDTO(dto1);
        checkDTO(dto2);
        checkDTO(dto3);
    }

    public void checkDTO(CastingDTO dto){
        Object tempObject=dto.getObject();

        if(tempObject instanceof String){
            System.out.println((String) tempObject);
        } else if (tempObject instanceof StringBuffer) {
            System.out.println((StringBuffer) tempObject);
        } else if (tempObject instanceof  StringBuilder) {
            System.out.println((StringBuilder) tempObject);
        }
    }
    // 기존 Object로 구현할 때는, instanceof를 통해 타입을 확인하고 형 변환하는 등의 귀찮은 작업이 있었는데,
    // Generic을 사용하면 이런 귀찮은 작업없이 진행할 수 있어, 코드가 간결해진다.
    // 잘못된 타입으로 치환하면 Compile Error가 발생하기 때문에 코드에 에러가 발생할 가능성을 줄여준다.
    public void checkGenericDTO(){
        System.out.println("\n\n <<  check Generic Casting DTO >>");
        CastingGenericDTO<String> dto1=new CastingGenericDTO<>();
        dto1.setObject(new String("test String"));

        CastingGenericDTO<StringBuffer> dto2=new CastingGenericDTO<>();
        dto2.setObject(new StringBuffer("test String Buffer"));

        CastingGenericDTO<StringBuilder> dto3=new CastingGenericDTO<>();
        dto3.setObject(new StringBuilder("test String Builder"));

        String temp1= dto1.getObject();
        StringBuffer temp2=dto2.getObject();
        StringBuilder temp3=dto3.getObject();

        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(temp3);
    }
}
