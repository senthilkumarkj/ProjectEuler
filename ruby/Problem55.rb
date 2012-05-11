#!/usr/bin/ruby
max_iter=50
lychrel_no=0
for i in 10..10000
	iter=0
	while(iter<=max_iter)
		i = i + i.to_s.reverse.to_i
		if i.to_s == i.to_s.reverse
			break
		end
		iter = iter + 1
	end
	if iter > max_iter
		lychrel_no = lychrel_no + 1
	end
end

puts 'lychrel numbers below 10000 = '+lychrel_no.to_s