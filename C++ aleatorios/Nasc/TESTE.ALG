Algoritmo "Teste"

var
   i: inteiro
	A, B, C: real

inicio
	Escreval ("Digite um n�mero inteiro de 1 a 3: ")
	leia (i)
	escreval ("Digite um n�mero qualquer: ")
	leia (A)
	escreva ("Digite outro n�mero diferente do anterior: ")
	leia (B)
	escreva ("Digite o �ltimo um n�mero diferente dos anteriores: ")
	leia (C)
		Se i = 1 entao
			para A < B < C fa�a
				escreval ( A, B, C )
			para A < C < B fa�a
			
				escreva ( A, C, B );
				fim
			Se B<A<C
				inicio
				escreva ( B, A, C );
				fim
			Se B<C<A
				inicio
				escreva ( B, C, A );
				fim
			Se C<A<B
				inicio
				escreva ( C, A, B );
				fim
			Se C<B<A
				inicio
				escreva ( C, B, A );
				fim
		Se i = 2
			Se A<B<C;
				inicio
				escreva ( A, B, C );
				fim
			Se A<C<B
				inicio
				escreva ( A, C, B );
				fim
			Se B<A<C
				inicio
				escreva ( B, A, C );
				fim
			Se B<C<A
				inicio
				escreva ( A, C, B );
				fim
			Se C<A<B
				inicio
				escreva ( B, A, C );
				fim
			Se C<B<A
				inicio
				escreva ( A, B, C );
				fim
		Se i = 3
			Se A<B<C;
				inicio
				escreva ( A, C, B );
				fim
			Se A<C<B
				inicio
				escreva ( A, B, C );
				fim
			Se B<A<C
				inicio
				escreva ( B, C, A );
				fim
			Se B<C<A
				inicio
				escreva ( B, A, C );
				fim
			Se C<A<B
				inicio
				escreva ( C, B, A );
				fim
			Se C<B<A
				inicio
				escreva ( C, A, B );
				fim

			fim

		fim

FIMSE