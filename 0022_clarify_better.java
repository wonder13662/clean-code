public List<Cell[]> getFlaggedCells() {
	List<Cell[]> flaggedCells = new ArrayList<Cell[]>();
	for(Cell[] cell : gameBoard)
		if(cell[STATUS_VALUE] == FLAGGED)
			flaggedCells.add(cell);

	return flaggedCells;
}