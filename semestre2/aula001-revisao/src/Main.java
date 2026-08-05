void main() {

    List<Pessoa> listaPessoas = new ArrayList<>();

    Aluno aluno = new Aluno("Eduardo", "eduardo@email.com", "44455566677", "566339");
    Professor professor = new Professor("Evando", "evando@evando.com", "88899900011", "111333");

    listaPessoas.add(aluno);
    listaPessoas.add(professor);

    listaPessoas.forEach(System.out::println);

    aluno.dormindo();
    System.out.println();
    aluno.dormindo(8);

}
