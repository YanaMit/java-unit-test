@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expectedResult = true;
	assertEquals ("возраст должен быть больше или равен 18 лет", expectedResult, isAdult);// Напиши код здесь
}
