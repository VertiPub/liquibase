package liquibase.statement;

public class SetTableRemarksStatementTest extends AbstractSqStatementTest<SetTableRemarksStatement> {
    @Override
    protected SetTableRemarksStatement createStatementUnderTest() {
        return new SetTableRemarksStatement(null, null, null);
    }
}