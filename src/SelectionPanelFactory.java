public class SelectionPanelFactory implements SelectionPanelFactoryIF{

    @Override
    public SelectionPanelF createSelectionPanel(String discriminator) {
        if(discriminator.equals("character")) {
            return new CharacterSelectionPanel();
        }
        else if (discriminator.equals("weapon")) {
            return new WeaponSelectionPanel();
        }
        else {return null;}
    }
}
