# Torpedo

Program leírás: 1 játékos vs gép, 1D 7 elemű pálya, 1 3 elemű halyó, gép elhelyezi
Torpedo:
	nyert = 0
	pálya = pálya_elkészít()
	hajó_méret = 3
	pálya = hajó elhelyez(pálya, hajó_méret)
	Amíg nyert == 0:
		kiir()
		nyert = gép_lép()
		kiir()
		Ha: nyert == 0
			nyert = játékos_lép()
	nyertes_kiir()
Program vége


pálya_elkészít(PÁLYA_MÉRET)
	pálya = []
	i = 0
	Amíg: i<PÁLYA_MÉRET
		pálya:=pálya + „_”
		i:=i+1
	Ki: pálya
Metódus vége


halyó_elhelyez(pálya, hajó_méret)
	pos = random(0, PÁLYA_MÉRET - hajó_méret)
	Amíg: pos<pos + hajó_méret - 1
		pálya[pos] = „#”
		pos:=pos+1
	Ki: pálya
Metódus vége





