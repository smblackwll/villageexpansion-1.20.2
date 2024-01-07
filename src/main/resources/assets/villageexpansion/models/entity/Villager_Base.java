// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class CustomModel extends EntityModel<Entity> {
	private final ModelPart bb_main;
	public CustomModel(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(16, 32).cuboid(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(32, 0).cuboid(0.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 16).cuboid(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 32).cuboid(-8.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 16).cuboid(4.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.0F, -27.0F, 4.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bb_main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}