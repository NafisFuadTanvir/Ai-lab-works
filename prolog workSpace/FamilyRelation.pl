male(kalaMia).
male(Khalek).
male(Malek).
male(Tanvir).
male(Tahsin).
female(AyeshaKhatun).
female(Nargis).
female(RokeyaKhatun).
female(Rupa).
female(Shampa).
father(kalaMia,Khalek).
father(kalaMia,Malek).
father(Khalek,Tanvir).
father(Khalek,Tahsin).
father(Malek,Rupa).
father(Malek,Shampa).
mother(AyeshaKhatun,Khalek).
mother(AyeshaKhatun,Malek).
mother(Nargis,Tanvir).
mother(Nargis,Tahsin).
mother(RokeyaKhatun,Rupa).
mother(RokeyaKhatun,Shampa).
husband(Khalek,Nargis).
husband(Malek,RokeyaKhatun).
parent(X,Y):-father(X,Y).
parent(X,Y):-mother(X,Y).
sibling(X,Y):-parent(Z,X),parent(Z,Y),X\=Y.
brother(X,Y):-sibling(X,Y),male(X).
sister(X,Y):-sibling(X,Y),female(X).
grandparent(X,Y):-parent(X,Z),parent(Z,Y).
grandfather(X,Y):-grandparent(X,Y),male(X).
grandmother(X,Y):-grandparent(X,Y),female(X).
uncle(X,Y):-brother(X,Z),parent(Z,Y).
aunt(X,Y):-sister(X,Z),parent(Z,Y).
cousin(X,Y):-parent(Z,X),sibling(Z,W),parent(W,Y).



