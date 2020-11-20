<template>
  <div class="hello">
    <p style="padding: 50px;">
      <marquee scrolldelay="20" scrollamount="20"
        >한학기 동안 너무 고생 많았어요. 2학기 가서도 열심히 공부하는 4기 되고
        좋은 결과있기를 바랄께요!!! 싸피 4 氣 충 전~~~~</marquee
      >
    </p>
  </div>
</template>

<script>
export default {
  name: "Main",
  props: {
    msg: String
  }
};
</script>

<style scoped>
p {
  font-size: 30pt;
  color: aquamarine;
}
</style>
