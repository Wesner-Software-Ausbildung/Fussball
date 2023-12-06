package de.szut.soccer;



public class CoachTest {
    @Test
        public void givenExperienceLowerHigher10_WhenValidate_Return10(){
        Coach rehhagel = new Coach("Rehhagel", 84, 11);
        assertEquals(10, rehhagel.getExperience()); }

}
